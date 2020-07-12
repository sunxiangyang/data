package bean;

import java.util.Date;

public class Associative {
    private Integer id;

    private String figureId;

    private String eventId;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFigureId() {
        return figureId;
    }

    public void setFigureId(String figureId) {
        this.figureId = figureId == null ? null : figureId.trim();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}