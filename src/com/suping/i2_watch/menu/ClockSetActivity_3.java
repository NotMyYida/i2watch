package com.suping.i2_watch.menu;

import com.suping.i2_watch.entity.I2WatchProtocolDataForWrite;
import com.suping.i2_watch.util.SharedPreferenceUtil;

import android.content.Intent;

public class ClockSetActivity_3 extends AbstractSetTimeActivity {
	private static final int RESULT_3 = 0x31;
	@Override
	public void confirm() {
		Intent intent = new Intent(ClockSetActivity_3.this, ClockActivity.class);
		intent.putExtras(b);
		setResult(RESULT_3, intent);
		finish();
	}
	@Override
	public void initValue() {
		String hour = (String) SharedPreferenceUtil.get(ClockSetActivity_3.this, I2WatchProtocolDataForWrite.SHARE_CLOCK_SETTIME_HOUR_3,
				"12");
		npHour.setValue(Integer.valueOf(hour));

		String min = (String) SharedPreferenceUtil.get(ClockSetActivity_3.this, I2WatchProtocolDataForWrite.SHARE_CLOCK_SETTIME_MIN_3,
				"00");
		npMin.setValue(Integer.valueOf(min));
//		if (min.equals(values[0])) {
//			npMin.setValue(0);
//		} else if (min.equals(values[1])) {
//			npMin.setValue(1);
//		}
	}
	@Override
	public boolean checkTime() {
		// TODO Auto-generated method stub
		return true;
	}
}
