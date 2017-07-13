package com.tcw.core.base.editer;

import org.springframework.beans.propertyeditors.PropertiesEditor;

import com.alibaba.druid.util.StringUtils;

public class DoubleEditor extends PropertiesEditor {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (StringUtils.isEmpty(text)) {
			text = "0";
		}
		setValue(Double.parseDouble(text));
	}

	@Override
	public String getAsText() {
		return getValue().toString();
	}
}