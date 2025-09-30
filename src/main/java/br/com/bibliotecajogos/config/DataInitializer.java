package br.com.bibliotecajogos.config;

import br.com.bibliotecajogos.entity.Categoria;
import br.com.bibliotecajogos.entity.Jogo;
import br.com.bibliotecajogos.repository.CategoriaRepository;
import br.com.bibliotecajogos.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate; // Importa a classe para datas
import java.util.Arrays;

@Component
@Profile("dev")
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private JogoRepository jogoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public void run(String... args) throws Exception {
        // Apaga todos os dados antigos para garantir um ambiente limpo a cada reinicialização
        jogoRepository.deleteAll();
        categoriaRepository.deleteAll();

        System.out.println(">>> Populando banco de dados de desenvolvimento com novos dados...");

        // Criar Categorias
        Categoria rpg = new Categoria();
        rpg.setNome("RPG");
        rpg.setDescricao("Jogos de interpretação de papéis com foco em narrativa e progressão de personagem.");

        Categoria acao = new Categoria();
        acao.setNome("Ação");
        acao.setDescricao("Jogos com foco em combate, reflexos rápidos e desafios físicos.");

        Categoria estrategia = new Categoria();
        estrategia.setNome("Estratégia");
        estrategia.setDescricao("Jogos que exigem planejamento, tática e gerenciamento de recursos.");

        Categoria aventura = new Categoria();
        aventura.setNome("Aventura");
        aventura.setDescricao("Jogos focados na exploração, quebra-cabeças e narrativa.");

        categoriaRepository.saveAll(Arrays.asList(rpg, acao, estrategia, aventura));

        // Criar Jogos
        Jogo jogo1 = new Jogo();
        jogo1.setTitulo("The Witcher 3: Wild Hunt");
        jogo1.setAutor("CD Projekt Red");
        jogo1.setAnoPublicacao(2015);
        jogo1.setGenero("RPG de Ação");
        jogo1.setCategoria(rpg);
        jogo1.setFinalizado(true);
        jogo1.setUrlCapa("https://upload.wikimedia.org/wikipedia/pt/thumb/0/06/TW3_Wild_Hunt.png/270px-TW3_Wild_Hunt.png");
        // Novos dados
        jogo1.setPlataforma("PC, PS4, Xbox One");
        jogo1.setDescricao("Um caçador de monstros em uma jornada para encontrar sua filha adotiva em um vasto mundo aberto.");
        jogo1.setNota(9.8);
        jogo1.setDataLancamento(LocalDate.of(2015, 5, 19));

        Jogo jogo2 = new Jogo();
        jogo2.setTitulo("Red Dead Redemption 2");
        jogo2.setAutor("Rockstar Games");
        jogo2.setAnoPublicacao(2018);
        jogo2.setGenero("Ação-Aventura");
        jogo2.setCategoria(acao);
        jogo2.setFinalizado(true);
        jogo2.setUrlCapa("https://upload.wikimedia.org/wikipedia/pt/e/e7/Red_Dead_Redemption_2.png");
        // Novos dados
        jogo2.setPlataforma("PS4, Xbox One, PC");
        jogo2.setDescricao("A história de Arthur Morgan e a gangue Van der Linde em fuga no final da era do Velho Oeste.");
        jogo2.setNota(9.7);
        jogo2.setDataLancamento(LocalDate.of(2018, 10, 26));

        Jogo jogo3 = new Jogo();
        jogo3.setTitulo("Age of Empires IV");
        jogo3.setAutor("Relic Entertainment");
        jogo3.setAnoPublicacao(2021);
        jogo3.setGenero("Estratégia em Tempo Real");
        jogo3.setCategoria(estrategia);
        jogo3.setFinalizado(false);
        jogo3.setUrlCapa("https://upload.wikimedia.org/wikipedia/pt/4/43/Capa_do_jogo_Age_of_Empires_IV.jpg");
        // Novos dados
        jogo3.setPlataforma("PC");
        jogo3.setDescricao("Comande civilizações históricas em batalhas estratégicas épicas através dos tempos.");
        jogo3.setNota(8.5);
        jogo3.setDataLancamento(LocalDate.of(2021, 10, 28));

        Jogo jogo4 = new Jogo();
        jogo4.setTitulo("Baldur's Gate 3");
        jogo4.setAutor("Larian Studios");
        jogo4.setAnoPublicacao(2023);
        jogo4.setGenero("RPG");
        jogo4.setCategoria(rpg);
        jogo4.setFinalizado(false);
        jogo4.setUrlCapa("https://upload.wikimedia.org/wikipedia/pt/1/18/Baldur%27s_Gate_III_Larian_Studios_key_art.png");
        // Novos dados
        jogo4.setPlataforma("PC, PS5");
        jogo4.setDescricao("Um RPG de nova geração ambientado no universo de Dungeons & Dragons.");
        jogo4.setNota(10.0);
        jogo4.setDataLancamento(LocalDate.of(2023, 8, 3));

        jogoRepository.saveAll(Arrays.asList(jogo1, jogo2, jogo3, jogo4));

        System.out.println(">>> Banco de dados populado com sucesso!");
    }
}