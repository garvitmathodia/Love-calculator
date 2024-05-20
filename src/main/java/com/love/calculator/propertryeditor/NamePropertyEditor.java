package com.love.calculator.propertryeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {
	
	@Override
	public String getAsText() {
		// TODO Auto-generated method stub
		return super.getAsText();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		//the concept of property editor and formatter are quite similar...the formatter has two methods parse and print 
		//similarly the editor has to methods setastext and getastext  
		
		String myConvertedString = text.toUpperCase();
		setValue(myConvertedString);
	}

}
