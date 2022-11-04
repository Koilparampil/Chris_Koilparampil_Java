package com.company.gamestoreinvoicing.util.feign;

import com.company.gamestoreinvoicing.model.Console;
import com.company.gamestoreinvoicing.model.Game;
import com.company.gamestoreinvoicing.model.TShirt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.Option;
import java.util.Optional;

@FeignClient(name = "gamestore-catalog")
public interface CatalogClient {

    @GetMapping(value = "/console/{id}")
    public Optional<Console> getSingleConsole(@PathVariable("id") long id);

    @GetMapping(value = "/game/{id}")
    public Optional<Game> getSingleGame(@PathVariable("id") long id);

    @GetMapping(value = "/tshirt/{id}")
    public Optional<TShirt> getSingleTShirt(@PathVariable("id") long id);
}
