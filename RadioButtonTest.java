package com.obsqura.projectwithpom;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.RadioButtonPage;

public class RadioButtonTest extends Base {
	RadioButtonPage RadioButtonPageobj;
	@Test
	public void VerifyRadioButton() throws IOException {
		RadioButtonPageobj=new RadioButtonPage(driver); 
		//RadioButtonPageobj.donotSelcetRadioButton();
		//RadioButtonPageobj.selectMaleRadio();
		//RadioButtonPageobj.selectFemaleRadio();
		RadioButtonPageobj.maleRadioExcel();
		RadioButtonPageobj.femaleRadioExcel();
		
	}

}
