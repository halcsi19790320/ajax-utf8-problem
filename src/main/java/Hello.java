import java.io.Serializable;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@ViewScoped
@Named
public class Hello implements Serializable {

    private static final long serialVersionUID = -7474352426867236016L;
    
	private String property;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
    
	public void ajax() {
		System.out.println("Property:" + property);
	}


}