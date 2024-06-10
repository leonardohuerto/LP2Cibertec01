package API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class petController {

    public petController() {
        //El trabajo de injectar dependencias
    }

    @GetMapping("/pets/listado")
    public List<String> getAll() {
        List<String> pets = new ArrayList<>();
        pets.add("Bethobeen");
        pets.add("Lazi");
        pets.add("lucy");
        return pets;
    }
}
