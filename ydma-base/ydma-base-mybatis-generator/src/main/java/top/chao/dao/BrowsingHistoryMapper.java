package top.chao.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import top.chao.entity.BrowsingHistory;

public interface BrowsingHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table browsing_history
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    @Delete({
        "delete from browsing_history",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table browsing_history
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    @Insert({
        "insert into browsing_history (use_id, course_id, ",
        "browse_time, video_id)",
        "values (#{use_id,jdbcType=INTEGER}, #{course_id,jdbcType=INTEGER}, ",
        "#{browse_time,jdbcType=TIMESTAMP}, #{video_id,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(BrowsingHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table browsing_history
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    @InsertProvider(type=BrowsingHistorySqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(BrowsingHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table browsing_history
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    @Select({
        "select",
        "id, use_id, course_id, browse_time, video_id",
        "from browsing_history",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="use_id", property="use_id", jdbcType=JdbcType.INTEGER),
        @Result(column="course_id", property="course_id", jdbcType=JdbcType.INTEGER),
        @Result(column="browse_time", property="browse_time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="video_id", property="video_id", jdbcType=JdbcType.INTEGER)
    })
    BrowsingHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table browsing_history
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    @UpdateProvider(type=BrowsingHistorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BrowsingHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table browsing_history
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    @Update({
        "update browsing_history",
        "set use_id = #{use_id,jdbcType=INTEGER},",
          "course_id = #{course_id,jdbcType=INTEGER},",
          "browse_time = #{browse_time,jdbcType=TIMESTAMP},",
          "video_id = #{video_id,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BrowsingHistory record);
}