package br.com.dvrfood.pagamentos.repository;

import br.com.dvrfood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository <Pagamento, Long> {
}
