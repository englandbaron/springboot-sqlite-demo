package org.facengineer.RtcTrelloWeb;

import org.facengineer.DaoMapper.RtcTrelloDao;
import org.facengineer.Model.RtcTrelloModel;
import org.facengineer.PublicTools.BaseResponse;
import org.facengineer.PublicTools.LOG;
import org.facengineer.PublicTools.RespCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class BUserOperation {
    static LOG _logger = new LOG(BUserOperation.class);
    private RtcTrelloDao rtcTrelloDao;

    BUserOperation(RtcTrelloDao rtcTrelloDao) {
        this.rtcTrelloDao = rtcTrelloDao;
    }

    @RequestMapping(value = "userpost/")
    public BaseResponse UserAdd(@RequestParam(value = "rtcname", required = true) String rtcname,
                                @RequestParam(value = "trelloname", required = true) String trelloname) {
        BaseResponse response;
        if (rtcTrelloDao.InsertIntoUserInfo(trelloname,rtcname))
            response = new BaseResponse(RespCode.SUCCESS, "Success");
        else
            response = new BaseResponse(RespCode.SUCCESS, "Error");
        return response;
    }

    public static void OutputUserList(List<RtcTrelloModel> UserList) {
        for (RtcTrelloModel _model : UserList) {
            _logger.info(_model.getRtcname() + "|" + _model.getTrelloname()+"|");
        }
    }
}
