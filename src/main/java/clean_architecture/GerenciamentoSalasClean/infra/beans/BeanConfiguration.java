package clean_architecture.GerenciamentoSalasClean.infra.beans;


import clean_architecture.GerenciamentoSalasClean.core.gateway.SalaGatway;
import clean_architecture.GerenciamentoSalasClean.core.usecases.BuscarReservaCaseImpl;
import clean_architecture.GerenciamentoSalasClean.core.usecases.CriarReservaCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CriarReservaCaseImpl criarReservaCaseImpl(SalaGatway salaGatway) {
        return new CriarReservaCaseImpl(salaGatway);
    }


    @Bean
    public BuscarReservaCaseImpl buscarReservaCaseImpl(SalaGatway salaGatway) {
        return new BuscarReservaCaseImpl(salaGatway);
    }
}
