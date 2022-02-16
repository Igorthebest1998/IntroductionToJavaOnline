package com.epam.javaIntro.logic;

import java.util.Comparator;

import com.epam.javaIntro.entity.TouristAgency;
import com.epam.javaIntro.entity.Voucher;

public class TouristAgencyLogic {
	
	public void sortVouchersByPrice(TouristAgency touristAgency) {
		touristAgency.getVouchers().sort(Comparator.comparing(Voucher::getPrice));
	}

	public void sortVouchersByCountOfDays(TouristAgency touristAgency) {
		touristAgency.getVouchers().sort(Comparator.comparing(Voucher::getCountOfDays));
	}

}
