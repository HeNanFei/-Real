package com.zjt.pojo;

import java.util.ArrayList;
import java.util.List;

public class Prescore1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Prescore1Example() {
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

        public Criteria andChineseIsNull() {
            addCriterion("chinese is null");
            return (Criteria) this;
        }

        public Criteria andChineseIsNotNull() {
            addCriterion("chinese is not null");
            return (Criteria) this;
        }

        public Criteria andChineseEqualTo(Integer value) {
            addCriterion("chinese =", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotEqualTo(Integer value) {
            addCriterion("chinese <>", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseGreaterThan(Integer value) {
            addCriterion("chinese >", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseGreaterThanOrEqualTo(Integer value) {
            addCriterion("chinese >=", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseLessThan(Integer value) {
            addCriterion("chinese <", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseLessThanOrEqualTo(Integer value) {
            addCriterion("chinese <=", value, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseIn(List<Integer> values) {
            addCriterion("chinese in", values, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotIn(List<Integer> values) {
            addCriterion("chinese not in", values, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseBetween(Integer value1, Integer value2) {
            addCriterion("chinese between", value1, value2, "chinese");
            return (Criteria) this;
        }

        public Criteria andChineseNotBetween(Integer value1, Integer value2) {
            addCriterion("chinese not between", value1, value2, "chinese");
            return (Criteria) this;
        }

        public Criteria andMathIsNull() {
            addCriterion("math is null");
            return (Criteria) this;
        }

        public Criteria andMathIsNotNull() {
            addCriterion("math is not null");
            return (Criteria) this;
        }

        public Criteria andMathEqualTo(Integer value) {
            addCriterion("math =", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathNotEqualTo(Integer value) {
            addCriterion("math <>", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathGreaterThan(Integer value) {
            addCriterion("math >", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathGreaterThanOrEqualTo(Integer value) {
            addCriterion("math >=", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathLessThan(Integer value) {
            addCriterion("math <", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathLessThanOrEqualTo(Integer value) {
            addCriterion("math <=", value, "math");
            return (Criteria) this;
        }

        public Criteria andMathIn(List<Integer> values) {
            addCriterion("math in", values, "math");
            return (Criteria) this;
        }

        public Criteria andMathNotIn(List<Integer> values) {
            addCriterion("math not in", values, "math");
            return (Criteria) this;
        }

        public Criteria andMathBetween(Integer value1, Integer value2) {
            addCriterion("math between", value1, value2, "math");
            return (Criteria) this;
        }

        public Criteria andMathNotBetween(Integer value1, Integer value2) {
            addCriterion("math not between", value1, value2, "math");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNull() {
            addCriterion("english is null");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNotNull() {
            addCriterion("english is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishEqualTo(Integer value) {
            addCriterion("english =", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotEqualTo(Integer value) {
            addCriterion("english <>", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThan(Integer value) {
            addCriterion("english >", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThanOrEqualTo(Integer value) {
            addCriterion("english >=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThan(Integer value) {
            addCriterion("english <", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThanOrEqualTo(Integer value) {
            addCriterion("english <=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishIn(List<Integer> values) {
            addCriterion("english in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotIn(List<Integer> values) {
            addCriterion("english not in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishBetween(Integer value1, Integer value2) {
            addCriterion("english between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotBetween(Integer value1, Integer value2) {
            addCriterion("english not between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNull() {
            addCriterion("politics is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsIsNotNull() {
            addCriterion("politics is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsEqualTo(Integer value) {
            addCriterion("politics =", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotEqualTo(Integer value) {
            addCriterion("politics <>", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThan(Integer value) {
            addCriterion("politics >", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsGreaterThanOrEqualTo(Integer value) {
            addCriterion("politics >=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThan(Integer value) {
            addCriterion("politics <", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsLessThanOrEqualTo(Integer value) {
            addCriterion("politics <=", value, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsIn(List<Integer> values) {
            addCriterion("politics in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotIn(List<Integer> values) {
            addCriterion("politics not in", values, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsBetween(Integer value1, Integer value2) {
            addCriterion("politics between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andPoliticsNotBetween(Integer value1, Integer value2) {
            addCriterion("politics not between", value1, value2, "politics");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNull() {
            addCriterion("history is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNotNull() {
            addCriterion("history is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryEqualTo(Integer value) {
            addCriterion("history =", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotEqualTo(Integer value) {
            addCriterion("history <>", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThan(Integer value) {
            addCriterion("history >", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("history >=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThan(Integer value) {
            addCriterion("history <", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThanOrEqualTo(Integer value) {
            addCriterion("history <=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryIn(List<Integer> values) {
            addCriterion("history in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotIn(List<Integer> values) {
            addCriterion("history not in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryBetween(Integer value1, Integer value2) {
            addCriterion("history between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotBetween(Integer value1, Integer value2) {
            addCriterion("history not between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andGeographyIsNull() {
            addCriterion("geography is null");
            return (Criteria) this;
        }

        public Criteria andGeographyIsNotNull() {
            addCriterion("geography is not null");
            return (Criteria) this;
        }

        public Criteria andGeographyEqualTo(Integer value) {
            addCriterion("geography =", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyNotEqualTo(Integer value) {
            addCriterion("geography <>", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyGreaterThan(Integer value) {
            addCriterion("geography >", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyGreaterThanOrEqualTo(Integer value) {
            addCriterion("geography >=", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyLessThan(Integer value) {
            addCriterion("geography <", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyLessThanOrEqualTo(Integer value) {
            addCriterion("geography <=", value, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyIn(List<Integer> values) {
            addCriterion("geography in", values, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyNotIn(List<Integer> values) {
            addCriterion("geography not in", values, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyBetween(Integer value1, Integer value2) {
            addCriterion("geography between", value1, value2, "geography");
            return (Criteria) this;
        }

        public Criteria andGeographyNotBetween(Integer value1, Integer value2) {
            addCriterion("geography not between", value1, value2, "geography");
            return (Criteria) this;
        }

        public Criteria andPhysicsIsNull() {
            addCriterion("physics is null");
            return (Criteria) this;
        }

        public Criteria andPhysicsIsNotNull() {
            addCriterion("physics is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicsEqualTo(Integer value) {
            addCriterion("physics =", value, "physics");
            return (Criteria) this;
        }

        public Criteria andPhysicsNotEqualTo(Integer value) {
            addCriterion("physics <>", value, "physics");
            return (Criteria) this;
        }

        public Criteria andPhysicsGreaterThan(Integer value) {
            addCriterion("physics >", value, "physics");
            return (Criteria) this;
        }

        public Criteria andPhysicsGreaterThanOrEqualTo(Integer value) {
            addCriterion("physics >=", value, "physics");
            return (Criteria) this;
        }

        public Criteria andPhysicsLessThan(Integer value) {
            addCriterion("physics <", value, "physics");
            return (Criteria) this;
        }

        public Criteria andPhysicsLessThanOrEqualTo(Integer value) {
            addCriterion("physics <=", value, "physics");
            return (Criteria) this;
        }

        public Criteria andPhysicsIn(List<Integer> values) {
            addCriterion("physics in", values, "physics");
            return (Criteria) this;
        }

        public Criteria andPhysicsNotIn(List<Integer> values) {
            addCriterion("physics not in", values, "physics");
            return (Criteria) this;
        }

        public Criteria andPhysicsBetween(Integer value1, Integer value2) {
            addCriterion("physics between", value1, value2, "physics");
            return (Criteria) this;
        }

        public Criteria andPhysicsNotBetween(Integer value1, Integer value2) {
            addCriterion("physics not between", value1, value2, "physics");
            return (Criteria) this;
        }

        public Criteria andChemistryIsNull() {
            addCriterion("chemistry is null");
            return (Criteria) this;
        }

        public Criteria andChemistryIsNotNull() {
            addCriterion("chemistry is not null");
            return (Criteria) this;
        }

        public Criteria andChemistryEqualTo(Integer value) {
            addCriterion("chemistry =", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryNotEqualTo(Integer value) {
            addCriterion("chemistry <>", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryGreaterThan(Integer value) {
            addCriterion("chemistry >", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryGreaterThanOrEqualTo(Integer value) {
            addCriterion("chemistry >=", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryLessThan(Integer value) {
            addCriterion("chemistry <", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryLessThanOrEqualTo(Integer value) {
            addCriterion("chemistry <=", value, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryIn(List<Integer> values) {
            addCriterion("chemistry in", values, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryNotIn(List<Integer> values) {
            addCriterion("chemistry not in", values, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryBetween(Integer value1, Integer value2) {
            addCriterion("chemistry between", value1, value2, "chemistry");
            return (Criteria) this;
        }

        public Criteria andChemistryNotBetween(Integer value1, Integer value2) {
            addCriterion("chemistry not between", value1, value2, "chemistry");
            return (Criteria) this;
        }

        public Criteria andBiologyIsNull() {
            addCriterion("biology is null");
            return (Criteria) this;
        }

        public Criteria andBiologyIsNotNull() {
            addCriterion("biology is not null");
            return (Criteria) this;
        }

        public Criteria andBiologyEqualTo(Integer value) {
            addCriterion("biology =", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyNotEqualTo(Integer value) {
            addCriterion("biology <>", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyGreaterThan(Integer value) {
            addCriterion("biology >", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyGreaterThanOrEqualTo(Integer value) {
            addCriterion("biology >=", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyLessThan(Integer value) {
            addCriterion("biology <", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyLessThanOrEqualTo(Integer value) {
            addCriterion("biology <=", value, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyIn(List<Integer> values) {
            addCriterion("biology in", values, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyNotIn(List<Integer> values) {
            addCriterion("biology not in", values, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyBetween(Integer value1, Integer value2) {
            addCriterion("biology between", value1, value2, "biology");
            return (Criteria) this;
        }

        public Criteria andBiologyNotBetween(Integer value1, Integer value2) {
            addCriterion("biology not between", value1, value2, "biology");
            return (Criteria) this;
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

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
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