package steps;

import elements.CadastrarClienteElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Browser;
import pages.CadastrarNovoClientePage;
import pages.HomePage;
import pages.Metodos;

public class CadastrarNovoClienteTest {

	Browser browser = new Browser();
	HomePage home = new HomePage();
	Metodos mtd = new Metodos();
	CadastrarNovoClientePage cadastrar = new CadastrarNovoClientePage();
	CadastrarClienteElements eLCadastrar = new CadastrarClienteElements();
	
	String username;
	String email;

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		browser.abrirBrowser(site);

	}

	@Given("acessar formulario de abertura de conta")
	public void acessar_formulario_de_abertura_de_conta() {
		home.formularioCadastroCliente();

	}

	@When("preencher todos os campos obrigatorios")
	public void preencher_todos_os_campos_obrigatorios() {
		username = mtd.nameGenerator();
		email = mtd.emailgenerator();
		cadastrar.cadastrarCliente(this.username, this.email, "Keeggo123","Keeggo123");
	}

	@Then("cliente cadastrado com sucesso")
	public void cliente_cadastrado_com_sucesso() {
		mtd.threadSleep(3000);
		mtd.screenShot("Cadastro realizado com sucesso");
		mtd.assertText(eLCadastrar.getExpectedText(), username);
	}

}
