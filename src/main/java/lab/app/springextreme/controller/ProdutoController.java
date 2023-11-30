package lab.app.springextreme.controller;

import lab.app.springextreme.domain.Produto;
import lab.app.springextreme.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    @GetMapping("produtos")
    public ResponseEntity<List<Produto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Produto> findById(@PathVariable("id") Long id) {
        var produto = produtoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Produto não encontrado com o ID: " + id));
        return ResponseEntity.status(HttpStatus.OK).body(produto);
    }

    @PostMapping("produto")
    public ResponseEntity<Produto> save(@RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
    }

    @PutMapping("{id}")
    public ResponseEntity<Produto> update(@PathVariable("id") Long id, @RequestBody Produto updatedProduto) {
        var produto = produtoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Produto não encontrado com o ID: " + id));
        BeanUtils.copyProperties(updatedProduto, produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {

        var produto = produtoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Produto não encontrado com o ID: " + id));
        produtoRepository.delete(produto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
