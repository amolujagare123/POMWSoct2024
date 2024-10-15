import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
    @FindBy(id = "email")
    WebElement txtemail;
    @FindBy(xpath = "//button[@type='submit']") WebElement btnReset;

    public ForgotPassword(WebDriver driver){
        PageFactory.initElements(driver,this );
    }

    public void setTxtEmail(String email){
        txtemail.sendKeys(email);
    }
    public void clickReset(){
        btnReset.click();
    }
}
