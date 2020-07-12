package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SourcesExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("intro is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("intro is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("intro =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("intro <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("intro >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("intro >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("intro <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("intro <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("intro like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("intro not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("intro in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("intro not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("intro between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("intro not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andSortNumIsNull() {
            addCriterion("sort_num is null");
            return (Criteria) this;
        }

        public Criteria andSortNumIsNotNull() {
            addCriterion("sort_num is not null");
            return (Criteria) this;
        }

        public Criteria andSortNumEqualTo(Integer value) {
            addCriterion("sort_num =", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotEqualTo(Integer value) {
            addCriterion("sort_num <>", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThan(Integer value) {
            addCriterion("sort_num >", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_num >=", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThan(Integer value) {
            addCriterion("sort_num <", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThanOrEqualTo(Integer value) {
            addCriterion("sort_num <=", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumIn(List<Integer> values) {
            addCriterion("sort_num in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotIn(List<Integer> values) {
            addCriterion("sort_num not in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumBetween(Integer value1, Integer value2) {
            addCriterion("sort_num between", value1, value2, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_num not between", value1, value2, "sortNum");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("creator_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("creator_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("creator_name =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("creator_name <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("creator_name >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creator_name >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("creator_name <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("creator_name <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("creator_name like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("creator_name not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("creator_name in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("creator_name not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("creator_name between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("creator_name not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNull() {
            addCriterion("updater_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNotNull() {
            addCriterion("updater_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdEqualTo(Integer value) {
            addCriterion("updater_id =", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotEqualTo(Integer value) {
            addCriterion("updater_id <>", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThan(Integer value) {
            addCriterion("updater_id >", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("updater_id >=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThan(Integer value) {
            addCriterion("updater_id <", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("updater_id <=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIn(List<Integer> values) {
            addCriterion("updater_id in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotIn(List<Integer> values) {
            addCriterion("updater_id not in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdBetween(Integer value1, Integer value2) {
            addCriterion("updater_id between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("updater_id not between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIsNull() {
            addCriterion("updater_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIsNotNull() {
            addCriterion("updater_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameEqualTo(String value) {
            addCriterion("updater_name =", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotEqualTo(String value) {
            addCriterion("updater_name <>", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameGreaterThan(String value) {
            addCriterion("updater_name >", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameGreaterThanOrEqualTo(String value) {
            addCriterion("updater_name >=", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLessThan(String value) {
            addCriterion("updater_name <", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLessThanOrEqualTo(String value) {
            addCriterion("updater_name <=", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLike(String value) {
            addCriterion("updater_name like", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotLike(String value) {
            addCriterion("updater_name not like", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIn(List<String> values) {
            addCriterion("updater_name in", values, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotIn(List<String> values) {
            addCriterion("updater_name not in", values, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameBetween(String value1, String value2) {
            addCriterion("updater_name between", value1, value2, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotBetween(String value1, String value2) {
            addCriterion("updater_name not between", value1, value2, "updaterName");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNull() {
            addCriterion("deleted_at is null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNotNull() {
            addCriterion("deleted_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtEqualTo(Date value) {
            addCriterion("deleted_at =", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotEqualTo(Date value) {
            addCriterion("deleted_at <>", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThan(Date value) {
            addCriterion("deleted_at >", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("deleted_at >=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThan(Date value) {
            addCriterion("deleted_at <", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThanOrEqualTo(Date value) {
            addCriterion("deleted_at <=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIn(List<Date> values) {
            addCriterion("deleted_at in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotIn(List<Date> values) {
            addCriterion("deleted_at not in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtBetween(Date value1, Date value2) {
            addCriterion("deleted_at between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotBetween(Date value1, Date value2) {
            addCriterion("deleted_at not between", value1, value2, "deletedAt");
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