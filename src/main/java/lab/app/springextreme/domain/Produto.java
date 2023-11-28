package lab.app.springextreme.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCT")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUTO")
    @SequenceGenerator(name = "SEQ_PRODUTO", sequenceName = "SEQ_PRODUTO")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "QUANTIDADE")
    private BigDecimal quantidade;

}
