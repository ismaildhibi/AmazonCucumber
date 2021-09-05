package StepsDefinitions;

import com.Pages.ShiftPage;
import com.redsea.base.Base;
import io.cucumber.java.en.When;

public class ceate_Holiday_Step extends Base {

    ShiftPage shift;


    @When("click to Shift button shift and srarch {string} the shift will be add holiday")
    public void click_to_shift_button_and_srarch_name_the_shift_will_be_add_holiday(String name) throws InterruptedException {
        shift = new ShiftPage(driver);
        shift.clicktobuttonShift();
        shift.SearchShift(name);
        Thread.sleep(2000);

        shift.clicktoEditShift();

        Thread.sleep(2000);
        shift.clicktoAddholiday();
        Thread.sleep(2000);

    }

    @When("the user click to holiday then enter the date (.*) and name (.*)$")
    public void the_user_click_to_holiday_then_enter_the_date_automation_role_and_name_this_role_for_automation(String dateofholiday, String name) {
        shift = new ShiftPage(driver);
        shift.clicktoAddholiday(dateofholiday);
        shift.setholidayname(name);
        shift.clicktoadddate();
        shift.clicktoAddholiday(dateofholiday);
        shift.setholidayname(name);
        shift.clicktoadddate();

    }


}
