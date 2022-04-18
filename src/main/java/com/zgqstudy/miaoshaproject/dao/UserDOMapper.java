package com.zgqstudy.miaoshaproject.dao;

import com.zgqstudy.miaoshaproject.dataobject.UserDO;

public interface UserDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Nov 11 21:39:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Nov 11 21:39:52 CST 2018
     */
    int insert(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Nov 11 21:39:52 CST 2018
     */
    int insertSelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Nov 11 21:39:52 CST 2018
     */
    UserDO selectByPrimaryKey(Integer id);

    UserDO selectByTelphone(String telphone);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Nov 11 21:39:52 CST 2018
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sun Nov 11 21:39:52 CST 2018
     */
    int updateByPrimaryKey(UserDO record);
}