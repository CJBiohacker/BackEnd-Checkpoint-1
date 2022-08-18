package test;

import dao.ConfigJDBC;
import dao.impl.FilialDaoImpl;
import model.Filial;
import org.junit.jupiter.api.Test;
import service.FilialService;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilialServiceTest {
    private FilialService filialService = new FilialService(new FilialDaoImpl(new ConfigJDBC()));

    @Test
    public void salvarFilial1() {

        Filial filial = new Filial(1,"Hotel Ponta de Lança" , "Rua das Acácis", "123", "SP", "São Paulo", true);
        filialService.create(filial);

        assertTrue(filial.getId() != 0);

    }

    @Test
    public void salvarFilial2() {

        Filial filial = new Filial(2,"Copacabana Palace", "Avenida Lorenzinni de Almeida", "41", "Rio de Janeiro", "RJ", true);
        filialService.create(filial);

        assertTrue(filial.getId() != 0);
    }

    @Test
    public void salvarFilial3() {

        Filial filial = new Filial(3,"Hotel Solar Ibiza", "Rua das Palemiras Verdes", "659", "São Paulo", "SP", false);
        filialService.create(filial);

        assertTrue(filial.getId() != 0);
    }

    @Test
    public void salvarFilial4() {

        Filial filial = new Filial(4,"Hotel Cabana dos Viajantes", "Rua Ascenção", "6969", "São Paulo", "SP", false);
        filialService.create(filial);

        assertTrue(filial.getId() != 0);
    }

    @Test
    public void salvarFilial5() {

        Filial filial = new Filial(5,"Hotel Lunar Twilight", "Rua dos Portais", "666", "Belo Horizonte", "MG", true);
        filialService.create(filial);

        assertTrue(filial.getId() != 0);
    }
}
