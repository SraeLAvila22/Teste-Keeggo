package pages;

import elements.HomePageElements;

public class HomePage {

	Metodos mtd = new Metodos();
	HomePageElements elmt = new HomePageElements();

	public void formularioCadastroCliente() {
		mtd.click(elmt.getMenuUser());
		mtd.threadSleep(5000);
		mtd.clickByText("a", "CREATE NEW ACCOUNT");

	}
}
