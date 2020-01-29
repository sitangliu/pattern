package com.ijianghu.pattern.prototype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamGroupStrategyVO implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer flag;

    private Integer type;

    private Integer priority;

    private Integer cycleId;

    private String name;

    private String remark;

    private String condition;

    private Date createTime;

    private Date updateTime;

    private Integer docNum;

    private Integer rowNum;

    private boolean isFirst = false;

    private boolean isLast = false;

    private StrategyCondition strategyCondition = new StrategyCondition();

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getCycleId() {
        return cycleId;
    }

    public void setCycleId(Integer cycleId) {
        this.cycleId = cycleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDocNum() {
        return docNum;
    }

    public void setDocNum(Integer docNum) {
        this.docNum = docNum;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }

    public StrategyCondition getStrategyCondition() {
        return strategyCondition;
    }

    public void setStrategyCondition(StrategyCondition strategyCondition) {
        this.strategyCondition = strategyCondition;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public static class StrategyCondition{
        private List<String> orgUuid = new ArrayList<>();

        private Integer examType = new Integer(0);

        private List<Integer> docProf  = new ArrayList<>();

        private List<Integer> doctorLevel  = new ArrayList<>();

        private List<Integer> pracRange  = new ArrayList<>();

        private List<Integer> pracType  = new ArrayList<>();

        public List<String> getOrgUuid() {
            return orgUuid;
        }

        public void setOrgUuid(List<String> orgUuid) {
            this.orgUuid = orgUuid;
        }

        public Integer getExamType() {
            return examType;
        }

        public void setExamType(Integer examType) {
            this.examType = examType;
        }

        public List<Integer> getDocProf() {
            return docProf;
        }

        public void setDocProf(List<Integer> docProf) {
            this.docProf = docProf;
        }

        public List<Integer> getDoctorLevel() {
            return doctorLevel;
        }

        public void setDoctorLevel(List<Integer> doctorLevel) {
            this.doctorLevel = doctorLevel;
        }

        public List<Integer> getPracRange() {
            return pracRange;
        }

        public void setPracRange(List<Integer> pracRange) {
            this.pracRange = pracRange;
        }

        public List<Integer> getPracType() {
            return pracType;
        }

        public void setPracType(List<Integer> pracType) {
            this.pracType = pracType;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", flag=").append(flag);
        sb.append(", type=").append(type);
        sb.append(", priority=").append(priority);
        sb.append(", cycleId=").append(cycleId);
        sb.append(", name=").append(name);
        sb.append(", docNum=").append(docNum);
        sb.append(", remark=").append(remark);
        sb.append(", condition=").append(condition);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}