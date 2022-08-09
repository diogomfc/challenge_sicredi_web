package br.com.sicredi.runner;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.sicredi.elementos.ElementosTestes;
import br.com.sicredi.pages.MetodosdeTestes;

public class Executa {
  MetodosdeTestes metodos = new MetodosdeTestes();
  ElementosTestes testesElementos = new ElementosTestes();

  @Before
  public void inicializa() throws IOException {
    metodos.abrirNavegador("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
  }

  @After
  public void finaliza() {
    metodos.fecharNavegador();
  }

  @Test
  public void teste() throws IOException {
    metodos.selectedSwitchVersions(testesElementos.selectedSwitchVersions);
  }
}
