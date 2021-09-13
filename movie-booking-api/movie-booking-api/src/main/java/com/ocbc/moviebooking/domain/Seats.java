package com.ocbc.moviebooking.domain;

public class Seat {

    private Integer SeatId;
    private Integer userId;
    private String seatName;
    private Integer seatPrice;


    public Seat(Integer seatId, Integer userId, String seatName, Integer seatPrice) {
        this.SeatId = SeatId;
        this.userId = userId;
        this.seatName = seatName;
        this.seatPrice = seatPrice;
    }

    public Integer getSeatId() {
        return seatId;
    } 0

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(Double totalExpense) {
        this.totalExpense = totalExpense;
    }

}
