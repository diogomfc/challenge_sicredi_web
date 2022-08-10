package br.com.sicredi.runner;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.sicredi.elementos.ElementosTestes;
import br.com.sicredi.pages.MetodosdeTestes;

public class Executa {
  MetodosdeTestes metodos = new MetodosdeTestes();
  ElementosTestes elementos = new ElementosTestes();

  @Before
  public void inicializa() throws IOException {
    metodos.abrirNavegador("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
  }

  @After
  public void finaliza() {
    metodos.fecharNavegador();
  }

  @Test
  public void teste() throws IOException, InterruptedException {
    metodos.selectedSwitchVersions(elementos.selectedSwitchVersions);
    metodos.btnAddCustomer(elementos.btnAddCustomer);
    metodos.inputCustomerName(elementos.inputCustomerName, "Teste Sicredi");
    metodos.inputContactLastName(elementos.inputContactLastName, "Teste");
    metodos.inputContactFirstName(elementos.inputContactFirstName, "Diogo Pereira Gomes Silva");
    metodos.inputPhone(elementos.inputPhone, "51 9999-9999");
    metodos.inputAddressLine1(elementos.inputAddressLine1, "Av Assis Brasil, 3970");
    metodos.inputAddressLine2(elementos.inputAddressLine2, "Torre D");
    metodos.inputCity(elementos.inputCity, "Porto Alegre");
    metodos.inputState(elementos.inputState, "RS");
    metodos.inputPostalCode(elementos.inputPostalCode, "91000-000");
    metodos.inputCountry(elementos.inputCountry, "Brazil");
    metodos.selectEmployee(elementos.SelectEmployee);
    metodos.inputTextChosenSearch(elementos.inputTextChosenSearch);
    metodos.insertTextChosenSearch(elementos.insertTextChosenSearch);
    metodos.inputCreditLimit(elementos.inputCreditLimit, "200");
    metodos.scroll(0, 280);
    metodos.btnSave(elementos.btnSave);
    metodos.mensageValida(elementos.mensageValida,
        "Your data has been successfully stored into the database.");
    metodos.screenshot("Page_AddCustomer_Grocerycrud");

  }
}
