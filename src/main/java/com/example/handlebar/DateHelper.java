package com.example.handlebar;

import com.example.util.DateUtil;
import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;

import java.sql.Timestamp;

public class DateHelper implements Helper<Timestamp> {
	@Override
	public CharSequence apply(Timestamp date, Options options) {
		return DateUtil.simpleDateFormatYYYYMMDDHHMM.format(date);
	}
}
