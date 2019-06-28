package com.zjt.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Student1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Student1Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSgenderIsNull() {
            addCriterion("sgender is null");
            return (Criteria) this;
        }

        public Criteria andSgenderIsNotNull() {
            addCriterion("sgender is not null");
            return (Criteria) this;
        }

        public Criteria andSgenderEqualTo(String value) {
            addCriterion("sgender =", value, "sgender");
            return (Criteria) this;
        }

        public Criteria andSgenderNotEqualTo(String value) {
            addCriterion("sgender <>", value, "sgender");
            return (Criteria) this;
        }

        public Criteria andSgenderGreaterThan(String value) {
            addCriterion("sgender >", value, "sgender");
            return (Criteria) this;
        }

        public Criteria andSgenderGreaterThanOrEqualTo(String value) {
            addCriterion("sgender >=", value, "sgender");
            return (Criteria) this;
        }

        public Criteria andSgenderLessThan(String value) {
            addCriterion("sgender <", value, "sgender");
            return (Criteria) this;
        }

        public Criteria andSgenderLessThanOrEqualTo(String value) {
            addCriterion("sgender <=", value, "sgender");
            return (Criteria) this;
        }

        public Criteria andSgenderLike(String value) {
            addCriterion("sgender like", value, "sgender");
            return (Criteria) this;
        }

        public Criteria andSgenderNotLike(String value) {
            addCriterion("sgender not like", value, "sgender");
            return (Criteria) this;
        }

        public Criteria andSgenderIn(List<String> values) {
            addCriterion("sgender in", values, "sgender");
            return (Criteria) this;
        }

        public Criteria andSgenderNotIn(List<String> values) {
            addCriterion("sgender not in", values, "sgender");
            return (Criteria) this;
        }

        public Criteria andSgenderBetween(String value1, String value2) {
            addCriterion("sgender between", value1, value2, "sgender");
            return (Criteria) this;
        }

        public Criteria andSgenderNotBetween(String value1, String value2) {
            addCriterion("sgender not between", value1, value2, "sgender");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIsNull() {
            addCriterion("sbirthday is null");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIsNotNull() {
            addCriterion("sbirthday is not null");
            return (Criteria) this;
        }

        public Criteria andSbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("sbirthday =", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("sbirthday <>", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("sbirthday >", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sbirthday >=", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("sbirthday <", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sbirthday <=", value, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("sbirthday in", values, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("sbirthday not in", values, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sbirthday between", value1, value2, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sbirthday not between", value1, value2, "sbirthday");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNull() {
            addCriterion("saddress is null");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNotNull() {
            addCriterion("saddress is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressEqualTo(String value) {
            addCriterion("saddress =", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotEqualTo(String value) {
            addCriterion("saddress <>", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThan(String value) {
            addCriterion("saddress >", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThanOrEqualTo(String value) {
            addCriterion("saddress >=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThan(String value) {
            addCriterion("saddress <", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThanOrEqualTo(String value) {
            addCriterion("saddress <=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLike(String value) {
            addCriterion("saddress like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotLike(String value) {
            addCriterion("saddress not like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressIn(List<String> values) {
            addCriterion("saddress in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotIn(List<String> values) {
            addCriterion("saddress not in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressBetween(String value1, String value2) {
            addCriterion("saddress between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotBetween(String value1, String value2) {
            addCriterion("saddress not between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andParentsIsNull() {
            addCriterion("parents is null");
            return (Criteria) this;
        }

        public Criteria andParentsIsNotNull() {
            addCriterion("parents is not null");
            return (Criteria) this;
        }

        public Criteria andParentsEqualTo(String value) {
            addCriterion("parents =", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsNotEqualTo(String value) {
            addCriterion("parents <>", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsGreaterThan(String value) {
            addCriterion("parents >", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsGreaterThanOrEqualTo(String value) {
            addCriterion("parents >=", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsLessThan(String value) {
            addCriterion("parents <", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsLessThanOrEqualTo(String value) {
            addCriterion("parents <=", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsLike(String value) {
            addCriterion("parents like", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsNotLike(String value) {
            addCriterion("parents not like", value, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsIn(List<String> values) {
            addCriterion("parents in", values, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsNotIn(List<String> values) {
            addCriterion("parents not in", values, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsBetween(String value1, String value2) {
            addCriterion("parents between", value1, value2, "parents");
            return (Criteria) this;
        }

        public Criteria andParentsNotBetween(String value1, String value2) {
            addCriterion("parents not between", value1, value2, "parents");
            return (Criteria) this;
        }

        public Criteria andDoaIsNull() {
            addCriterion("doa is null");
            return (Criteria) this;
        }

        public Criteria andDoaIsNotNull() {
            addCriterion("doa is not null");
            return (Criteria) this;
        }

        public Criteria andDoaEqualTo(Date value) {
            addCriterionForJDBCDate("doa =", value, "doa");
            return (Criteria) this;
        }

        public Criteria andDoaNotEqualTo(Date value) {
            addCriterionForJDBCDate("doa <>", value, "doa");
            return (Criteria) this;
        }

        public Criteria andDoaGreaterThan(Date value) {
            addCriterionForJDBCDate("doa >", value, "doa");
            return (Criteria) this;
        }

        public Criteria andDoaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("doa >=", value, "doa");
            return (Criteria) this;
        }

        public Criteria andDoaLessThan(Date value) {
            addCriterionForJDBCDate("doa <", value, "doa");
            return (Criteria) this;
        }

        public Criteria andDoaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("doa <=", value, "doa");
            return (Criteria) this;
        }

        public Criteria andDoaIn(List<Date> values) {
            addCriterionForJDBCDate("doa in", values, "doa");
            return (Criteria) this;
        }

        public Criteria andDoaNotIn(List<Date> values) {
            addCriterionForJDBCDate("doa not in", values, "doa");
            return (Criteria) this;
        }

        public Criteria andDoaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("doa between", value1, value2, "doa");
            return (Criteria) this;
        }

        public Criteria andDoaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("doa not between", value1, value2, "doa");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}