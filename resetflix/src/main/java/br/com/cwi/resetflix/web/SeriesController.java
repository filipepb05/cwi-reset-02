package br.com.cwi.resetflix.web;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import br.com.cwi.resetflix.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesController implements SeriesContract{

    @Autowired
    private SeriesService seriesService;


    @Override
    @GetMapping
    public List<SerieResponse> getSeries(@RequestParam(value = "genero", required = false) final Genero genero) {
        return seriesService.getSeries(genero);
    }

    @Override
    @GetMapping("/{id}")
    public ConsultarDetalhesSerieResponse getSerieById(Long id) {
        return seriesService.consultarDetalhesSerie(id);
    }

    @Override
    @PostMapping
    public Long criarSerie(@RequestBody final CriarSerieRequest request) {
        return seriesService.criarSerie(request);
    }

    @Override
    //Recomendações
    public List<SerieResponse> getSeries() {
        return null;
    }

    @Override
    public void assistirSerie(Long id, Integer temporada, Integer episodio) {

    }
}
