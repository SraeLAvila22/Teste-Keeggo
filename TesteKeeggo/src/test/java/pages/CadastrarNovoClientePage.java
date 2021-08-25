package pages;

import elements.CadastrarClienteElements;

public class CadastrarNovoClientePage {

	CadastrarClienteElements elmtCadastro = new CadastrarClienteElements();
	Metodos mtd = new Metodos();

	public void cadastrarCliente(String nome, String email, String senha, String confirmarSenha) {
		mtd.escrever(elmtCadastro.getUsername(), nome);
		mtd.escrever(elmtCadastro.getEmail(), email);
		mtd.escrever(elmtCadastro.getPassword(), senha);
		mtd.escrever(elmtCadastro.getConfirmPassword(), confirmarSenha);
		mtd.screenShot("Todos os campos obrigatórios preenchidos");
		mtd.click(elmtCadastro.getI_agree());
		mtd.click(elmtCadastro.getRegisterButton());
	}

}
