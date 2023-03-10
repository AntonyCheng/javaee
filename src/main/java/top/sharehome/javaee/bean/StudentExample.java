package top.sharehome.javaee.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStudentOneIsNull() {
            addCriterion("student_one is null");
            return (Criteria) this;
        }

        public Criteria andStudentOneIsNotNull() {
            addCriterion("student_one is not null");
            return (Criteria) this;
        }

        public Criteria andStudentOneEqualTo(Integer value) {
            addCriterion("student_one =", value, "studentOne");
            return (Criteria) this;
        }

        public Criteria andStudentOneNotEqualTo(Integer value) {
            addCriterion("student_one <>", value, "studentOne");
            return (Criteria) this;
        }

        public Criteria andStudentOneGreaterThan(Integer value) {
            addCriterion("student_one >", value, "studentOne");
            return (Criteria) this;
        }

        public Criteria andStudentOneGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_one >=", value, "studentOne");
            return (Criteria) this;
        }

        public Criteria andStudentOneLessThan(Integer value) {
            addCriterion("student_one <", value, "studentOne");
            return (Criteria) this;
        }

        public Criteria andStudentOneLessThanOrEqualTo(Integer value) {
            addCriterion("student_one <=", value, "studentOne");
            return (Criteria) this;
        }

        public Criteria andStudentOneIn(List<Integer> values) {
            addCriterion("student_one in", values, "studentOne");
            return (Criteria) this;
        }

        public Criteria andStudentOneNotIn(List<Integer> values) {
            addCriterion("student_one not in", values, "studentOne");
            return (Criteria) this;
        }

        public Criteria andStudentOneBetween(Integer value1, Integer value2) {
            addCriterion("student_one between", value1, value2, "studentOne");
            return (Criteria) this;
        }

        public Criteria andStudentOneNotBetween(Integer value1, Integer value2) {
            addCriterion("student_one not between", value1, value2, "studentOne");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentGenderIsNull() {
            addCriterion("student_gender is null");
            return (Criteria) this;
        }

        public Criteria andStudentGenderIsNotNull() {
            addCriterion("student_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGenderEqualTo(String value) {
            addCriterion("student_gender =", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotEqualTo(String value) {
            addCriterion("student_gender <>", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderGreaterThan(String value) {
            addCriterion("student_gender >", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderGreaterThanOrEqualTo(String value) {
            addCriterion("student_gender >=", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderLessThan(String value) {
            addCriterion("student_gender <", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderLessThanOrEqualTo(String value) {
            addCriterion("student_gender <=", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderLike(String value) {
            addCriterion("student_gender like", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotLike(String value) {
            addCriterion("student_gender not like", value, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderIn(List<String> values) {
            addCriterion("student_gender in", values, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotIn(List<String> values) {
            addCriterion("student_gender not in", values, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderBetween(String value1, String value2) {
            addCriterion("student_gender between", value1, value2, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentGenderNotBetween(String value1, String value2) {
            addCriterion("student_gender not between", value1, value2, "studentGender");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIsNull() {
            addCriterion("student_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIsNotNull() {
            addCriterion("student_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayEqualTo(String value) {
            addCriterion("student_birthday =", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotEqualTo(String value) {
            addCriterion("student_birthday <>", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayGreaterThan(String value) {
            addCriterion("student_birthday >", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("student_birthday >=", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayLessThan(String value) {
            addCriterion("student_birthday <", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayLessThanOrEqualTo(String value) {
            addCriterion("student_birthday <=", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayLike(String value) {
            addCriterion("student_birthday like", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotLike(String value) {
            addCriterion("student_birthday not like", value, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayIn(List<String> values) {
            addCriterion("student_birthday in", values, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotIn(List<String> values) {
            addCriterion("student_birthday not in", values, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayBetween(String value1, String value2) {
            addCriterion("student_birthday between", value1, value2, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentBirthdayNotBetween(String value1, String value2) {
            addCriterion("student_birthday not between", value1, value2, "studentBirthday");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeIsNull() {
            addCriterion("student_college is null");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeIsNotNull() {
            addCriterion("student_college is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeEqualTo(String value) {
            addCriterion("student_college =", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeNotEqualTo(String value) {
            addCriterion("student_college <>", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeGreaterThan(String value) {
            addCriterion("student_college >", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("student_college >=", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeLessThan(String value) {
            addCriterion("student_college <", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeLessThanOrEqualTo(String value) {
            addCriterion("student_college <=", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeLike(String value) {
            addCriterion("student_college like", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeNotLike(String value) {
            addCriterion("student_college not like", value, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeIn(List<String> values) {
            addCriterion("student_college in", values, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeNotIn(List<String> values) {
            addCriterion("student_college not in", values, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeBetween(String value1, String value2) {
            addCriterion("student_college between", value1, value2, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentCollegeNotBetween(String value1, String value2) {
            addCriterion("student_college not between", value1, value2, "studentCollege");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIsNull() {
            addCriterion("student_major is null");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIsNotNull() {
            addCriterion("student_major is not null");
            return (Criteria) this;
        }

        public Criteria andStudentMajorEqualTo(String value) {
            addCriterion("student_major =", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotEqualTo(String value) {
            addCriterion("student_major <>", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorGreaterThan(String value) {
            addCriterion("student_major >", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorGreaterThanOrEqualTo(String value) {
            addCriterion("student_major >=", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLessThan(String value) {
            addCriterion("student_major <", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLessThanOrEqualTo(String value) {
            addCriterion("student_major <=", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorLike(String value) {
            addCriterion("student_major like", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotLike(String value) {
            addCriterion("student_major not like", value, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorIn(List<String> values) {
            addCriterion("student_major in", values, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotIn(List<String> values) {
            addCriterion("student_major not in", values, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorBetween(String value1, String value2) {
            addCriterion("student_major between", value1, value2, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentMajorNotBetween(String value1, String value2) {
            addCriterion("student_major not between", value1, value2, "studentMajor");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIsNull() {
            addCriterion("student_grade is null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIsNotNull() {
            addCriterion("student_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeEqualTo(String value) {
            addCriterion("student_grade =", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotEqualTo(String value) {
            addCriterion("student_grade <>", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeGreaterThan(String value) {
            addCriterion("student_grade >", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeGreaterThanOrEqualTo(String value) {
            addCriterion("student_grade >=", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLessThan(String value) {
            addCriterion("student_grade <", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLessThanOrEqualTo(String value) {
            addCriterion("student_grade <=", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLike(String value) {
            addCriterion("student_grade like", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotLike(String value) {
            addCriterion("student_grade not like", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIn(List<String> values) {
            addCriterion("student_grade in", values, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotIn(List<String> values) {
            addCriterion("student_grade not in", values, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeBetween(String value1, String value2) {
            addCriterion("student_grade between", value1, value2, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotBetween(String value1, String value2) {
            addCriterion("student_grade not between", value1, value2, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNull() {
            addCriterion("student_phone is null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNotNull() {
            addCriterion("student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneEqualTo(String value) {
            addCriterion("student_phone =", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotEqualTo(String value) {
            addCriterion("student_phone <>", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThan(String value) {
            addCriterion("student_phone >", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_phone >=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThan(String value) {
            addCriterion("student_phone <", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("student_phone <=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLike(String value) {
            addCriterion("student_phone like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotLike(String value) {
            addCriterion("student_phone not like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIn(List<String> values) {
            addCriterion("student_phone in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotIn(List<String> values) {
            addCriterion("student_phone not in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneBetween(String value1, String value2) {
            addCriterion("student_phone between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("student_phone not between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNull() {
            addCriterion("student_address is null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNotNull() {
            addCriterion("student_address is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressEqualTo(String value) {
            addCriterion("student_address =", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotEqualTo(String value) {
            addCriterion("student_address <>", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThan(String value) {
            addCriterion("student_address >", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("student_address >=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThan(String value) {
            addCriterion("student_address <", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThanOrEqualTo(String value) {
            addCriterion("student_address <=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLike(String value) {
            addCriterion("student_address like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotLike(String value) {
            addCriterion("student_address not like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIn(List<String> values) {
            addCriterion("student_address in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotIn(List<String> values) {
            addCriterion("student_address not in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressBetween(String value1, String value2) {
            addCriterion("student_address between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotBetween(String value1, String value2) {
            addCriterion("student_address not between", value1, value2, "studentAddress");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_student
     *
     * @mbggenerated do_not_delete_during_merge Sun Nov 06 13:55:40 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_student
     *
     * @mbggenerated Sun Nov 06 13:55:40 CST 2022
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}