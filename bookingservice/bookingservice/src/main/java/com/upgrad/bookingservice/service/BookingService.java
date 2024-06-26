package com.upgrad.bookingservice.service;

import com.upgrad.bookingservice.DAO.BookingVO;
import com.upgrad.bookingservice.model.BookingInfoEntity;

public interface BookingService {
    public BookingVO makeBooking(BookingVO bookingVO);

    public BookingVO findBookingById(int id);

    public boolean isBookingExists(int id) ;
}
