package top.chao.entity;

import java.util.Date;

public class Answer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.id
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.context
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    private String context;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.publish_time
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    private Date publish_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.issue_id
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    private Integer issue_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.user_id
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    private Integer user_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.id
     *
     * @return the value of answer.id
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.id
     *
     * @param id the value for answer.id
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.context
     *
     * @return the value of answer.context
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.context
     *
     * @param context the value for answer.context
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.publish_time
     *
     * @return the value of answer.publish_time
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    public Date getPublish_time() {
        return publish_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.publish_time
     *
     * @param publish_time the value for answer.publish_time
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.issue_id
     *
     * @return the value of answer.issue_id
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    public Integer getIssue_id() {
        return issue_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.issue_id
     *
     * @param issue_id the value for answer.issue_id
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    public void setIssue_id(Integer issue_id) {
        this.issue_id = issue_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.user_id
     *
     * @return the value of answer.user_id
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.user_id
     *
     * @param user_id the value for answer.user_id
     *
     * @mbg.generated Mon Sep 02 21:19:46 CST 2019
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}