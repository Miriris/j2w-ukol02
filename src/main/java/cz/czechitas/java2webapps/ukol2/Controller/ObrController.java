package cz.czechitas.java2webapps.ukol2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller

public class ObrController {
    private final Random random;
    public ObrController() {
        random = new Random();
    }

    @GetMapping("/")

            public ModelAndView vymenCitat() {
            List<String> seznamCitatu = Arrays.asList("<strong>Debugging</strong> /de·bugh·ing/ <em>(verb)</em>:<br/> The Classic Mystery Game where you are the detective, the victim, and the murderer.",
                "A <strong>user interface</strong> is like a joke. <br/> If you have to explain it,<br/> it's not that good.",
                "To replace programmers with <strong>robots</strong>,<br/> clients will have to accurately describe what they want.<br/> We're safe.",
                "I have a <strong>joke</strong> on programming <br/> but it only works on my computer.",
                "99 <em>little bugs</em> in the code,<br/> 99 <em>bugs</em> in the code.<br/> Take one down, patch it around. <br/><strong>127 <em>little bugs</em> in the code…</strong>",
                "When I wrote this code, only <br/><strong>God & I</strong><br/> understood what it did. Now… <br/> Only <strong>God</strong> knows.",
                "<strong>Programmer</strong> <em>(noun.)</em>:<br/> A machine that turns coffee into code.",
                "<strong>Real programmers</strong><br/> count from<br/> <strong>0.</strong>");
            List<String> seznamObrazku = Arrays.asList("https://source.unsplash.com/TORW--MRydc/1600x900","https://source.unsplash.com/RFHFV7lVQBY/1600x900","https://source.unsplash.com/E9qMh69Ti88/1600x900","https://source.unsplash.com/KsWvLTlzTnk/1600x900");
            int index = random.nextInt(seznamCitatu.size());
            int index2 = random.nextInt(seznamObrazku.size());

            ModelAndView result = new ModelAndView("obrazky_a_citaty");
            result.addObject("citat", seznamCitatu.get(index));
            result.addObject("obrazek", (seznamObrazku.get(index2)));
            return result;

    }



}
