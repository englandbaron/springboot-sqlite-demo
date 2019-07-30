package org.facengineer.DaoMapper;

import org.facengineer.Model.RtcTrelloModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RtcTrelloDao {
    @Select("select * from usermapping")
    public List<RtcTrelloModel> GetUserMapping();

    @Insert("insert into usermapping values(#{trelloname},#{rtcname})")
    public boolean InsertIntoUserInfo(@Param("trelloname") String TrelloName, @Param("rtcname") String RtcName);
}
