package com/isc/backend.mvc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 记录志愿者参与活动情况
 * </p>
 *
 * @author 711lxsky
 * @since 2023-07-04
 */
@TableName("activity_volunteer_relation")
@ApiModel(value = "ActivityVolunteerRelation对象", description = "记录志愿者参与活动情况")
public class ActivityVolunteerRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer activityId;

    private Integer volunteerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(Integer volunteerId) {
        this.volunteerId = volunteerId;
    }

    @Override
    public String toString() {
        return "ActivityVolunteerRelation{" +
            "id = " + id +
            ", activityId = " + activityId +
            ", volunteerId = " + volunteerId +
        "}";
    }
}
