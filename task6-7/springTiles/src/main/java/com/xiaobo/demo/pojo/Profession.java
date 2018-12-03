package com.xiaobo.demo.pojo;

import com.xiaobo.demo.util.EntityToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table profession
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Component
public class Profession implements Serializable {
    public static final Integer OPTION_DEVELOPMENT_DIRECTION_FRONTEND = 1; // 前端开发方向
    public static final Integer OPTION_DEVELOPMENT_DIRECTION_BACKEND = 2; // 后端开发方向
    public static final Integer OPTION_DEVELOPMENT_DIRECTION_OP = 3; // 运维方向


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.img
     *
     * @mbg.generated
     */
    private String img;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.development_direction
     *
     * @mbg.generated
     */
    private Integer developmentDirection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.profession_name
     *
     * @mbg.generated
     */
    private Integer professionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.description
     *
     * @mbg.generated
     */
    private String description;

    private String cycle;

//    private Integer count;



    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.limit_condition
     *
     * @mbg.generated
     */
    private String limitCondition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.difficulty
     *
     * @mbg.generated
     */
    private String difficulty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.period_one
     *
     * @mbg.generated
     */
    private String periodOne;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.period_two
     *
     * @mbg.generated
     */
    private String periodTwo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.period_three
     *
     * @mbg.generated
     */
    private String periodThree;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.carrer_prospects
     *
     * @mbg.generated
     */
    private String careerProspects;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.salary_one
     *
     * @mbg.generated
     */
    private String salaryOne;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.salary_two
     *
     * @mbg.generated
     */
    private String salaryTwo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.salary_three
     *
     * @mbg.generated
     */
    private String salaryThree;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.create_at
     *
     * @mbg.generated
     */
    private Long createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profession.update_at
     *
     * @mbg.generated
     */
    private Long updateAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.id
     *
     * @return the value of profession.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.id
     *
     * @param id the value for profession.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.img
     *
     * @return the value of profession.img
     *
     * @mbg.generated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.img
     *
     * @param img the value for profession.img
     *
     * @mbg.generated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.development_direction
     *
     * @return the value of profession.development_direction
     *
     * @mbg.generated
     */
    public Integer getDevelopmentDirection() {
        return developmentDirection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.development_direction
     *
     * @param developmentDirection the value for profession.development_direction
     *
     * @mbg.generated
     */
    public void setDevelopmentDirection(Integer developmentDirection) {
        this.developmentDirection = developmentDirection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.profession_name
     *
     * @return the value of profession.profession_name
     *
     * @mbg.generated
     */
    public Integer getProfessionName() {
        return professionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.profession_name
     *
     * @param professionName the value for profession.profession_name
     *
     * @mbg.generated
     */
    public void setProfessionName(Integer professionName) {
        this.professionName = professionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.description
     *
     * @return the value of profession.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.description
     *
     * @param description the value for profession.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.limit_condition
     *
     * @return the value of profession.limit_condition
     *
     * @mbg.generated
     */
    public String getLimitCondition() {
        return limitCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.limit_condition
     *
     * @param limitCondition the value for profession.limit_condition
     *
     * @mbg.generated
     */
    public void setLimitCondition(String limitCondition) {
        this.limitCondition = limitCondition == null ? null : limitCondition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.difficulty
     *
     * @return the value of profession.difficulty
     *
     * @mbg.generated
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.difficulty
     *
     * @param difficulty the value for profession.difficulty
     *
     * @mbg.generated
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty == null ? null : difficulty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.period_one
     *
     * @return the value of profession.period_one
     *
     * @mbg.generated
     */
    public String getPeriodOne() {
        return periodOne;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.period_one
     *
     * @param periodOne the value for profession.period_one
     *
     * @mbg.generated
     */
    public void setPeriodOne(String periodOne) {
        this.periodOne = periodOne == null ? null : periodOne.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.period_two
     *
     * @return the value of profession.period_two
     *
     * @mbg.generated
     */
    public String getPeriodTwo() {
        return periodTwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.period_two
     *
     * @param periodTwo the value for profession.period_two
     *
     * @mbg.generated
     */
    public void setPeriodTwo(String periodTwo) {
        this.periodTwo = periodTwo == null ? null : periodTwo.trim();
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.period_three
     *
     * @return the value of profession.period_three
     *
     * @mbg.generated
     */
    public String getPeriodThree() {
        return periodThree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.period_three
     *
     * @param periodThree the value for profession.period_three
     *
     * @mbg.generated
     */
    public void setPeriodThree(String periodThree) {
        this.periodThree = periodThree == null ? null : periodThree.trim();
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.carrer_prospects
     *
     * @return the value of profession.carrer_prospects
     *
     * @mbg.generated
     */
    public String getCareerProspects() {
        return careerProspects;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.carrer_prospects
     *
     * @param careerProspects the value for profession.carrer_prospects
     *
     * @mbg.generated
     */
    public void setCareerProspects(String careerProspects) {
        this.careerProspects = careerProspects == null ? null : careerProspects.trim();
    }
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.salary_one
     *
     * @return the value of profession.salary_one
     *
     * @mbg.generated
     */
    public String getSalaryOne() {
        return salaryOne;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.salary_one
     *
     * @param salaryOne the value for profession.salary_one
     *
     * @mbg.generated
     */
    public void setSalaryOne(String salaryOne) {
        this.salaryOne = salaryOne;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.salary_two
     *
     * @return the value of profession.salary_two
     *
     * @mbg.generated
     */
    public String getSalaryTwo() {
        return salaryTwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.salary_two
     *
     * @param salaryTwo the value for profession.salary_two
     *
     * @mbg.generated
     */
    public void setSalaryTwo(String salaryTwo) {
        this.salaryTwo = salaryTwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.salary_three
     *
     * @return the value of profession.salary_three
     *
     * @mbg.generated
     */
    public String getSalaryThree() {
        return salaryThree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.salary_three
     *
     * @param salaryThree the value for profession.salary_three
     *
     * @mbg.generated
     */
    public void setSalaryThree(String salaryThree) {
        this.salaryThree = salaryThree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.create_at
     *
     * @return the value of profession.create_at
     *
     * @mbg.generated
     */
    public Long getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profession.create_at
     *
     * @param createAt the value for profession.create_at
     *
     * @mbg.generated
     */
    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profession.update_at
     *
     * @return the value of profession.update_at
     *
     * @mbg.generated
     */
    public Long getUpdateAt() {
        return updateAt;
    }


//    public Integer getCount() {
//        return count;
//    }
//
//    public void setCount(Integer count) {
//        this.count = count;
//    }
    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }
    @Override
    public String toString(){
        return EntityToString.getString(this,this.getClass( ));
    }
}