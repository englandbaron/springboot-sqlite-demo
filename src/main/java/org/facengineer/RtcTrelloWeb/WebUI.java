package org.facengineer.RtcTrelloWeb;

import org.facengineer.DaoMapper.RtcTrelloDao;
import org.facengineer.Model.RtcTrelloModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class WebUI {
    private RtcTrelloDao rtcTrelloDao;

    WebUI(RtcTrelloDao rtcTrelloDao){
        this.rtcTrelloDao = rtcTrelloDao;
    }
    @RequestMapping("/")
    public String Index(){
        return "index";
    }

    @RequestMapping("user/")
    public String UserMapping(Model model){
        List<RtcTrelloModel> UserList = this.rtcTrelloDao.GetUserMapping();
        BUserOperation.OutputUserList(UserList);
        List<String> USER_COLUMN_LIST = new ArrayList<>();
        USER_COLUMN_LIST.add("RtcName");
        USER_COLUMN_LIST.add("TrelloName");
        model.addAttribute("usercolumn",USER_COLUMN_LIST);
        model.addAttribute("userlist",UserList);
        return "user";
    }
}
