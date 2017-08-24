package frasesdodia.cursoandroid.com.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //INICIO DO CODIGO
    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Se você está atravessando o inferno, bem, continue atravessando – Winston Churchill",
            "Lembre-se: ninguém pode fazer você se sentir inferior sem o seu consentimento – Eleanor Roosevelt",
            "Não importa o quão rápido você anda, mas a força de vontade para nunca parar – Confúcio",
            "Uma pessoa que nunca cometeu erros nunca tentou algo novo – Albert Einstein",
            "Falhe sete vezes. Levante-se oito – provérbio japonês",
            "Há apenas uma maneira de evitar críticas: não fazer, não falar e não ser nada – Aristóteles",
            "Seu tempo é limitado, então não perca tempo vivendo a vida de outra pessoa – Steve Jobs",
            "Você não falhará se não subir a montanha. Mas não tem graça nenhuma viver sempre com o pé no chão – autor desconhecido",
            "Quando tudo parecer estar contra você, lembre-se que o avião decola contra o vento, não com a ajuda dele – Henry Ford",
            "80% do que leva as pessoas ao sucesso é se mostrar para o mundo – Woody Allen",
            "Não perca tempo tentando mudar a opinião dos outros. Faça seu trabalho e não ligue para o que pensam – Tina Fey",
            "Daqui 20 anos, você vai se arrepender pelo que não fez, não pelos erros que cometeu. Afaste-se do seu porto seguro. Enfrente o vento. Explore. Sonhe. Descubra – Mark Twain",
            "Sempre lembre que você é mais corajoso do que pensa, mais forte do que parece e mais esperto do que acredita – Christopher Robin",
            "Ok, você é inseguro. Mas adivinhe? O resto do mundo também é. Não superestime a concorrência e subestime você. Você é melhor do que acredita – T. Harv Eker",
            "Na vida, cada um tem dois caminhos a seguir: esperar pelo melhor dia da vida ou comemorar cada um deles como algo inesquecível – Rasheed Ogunlaru",
            "Um plano razoável executado hoje é melhor que um plano perfeito que sempre fica para a semana que vem – George Patton",
            "Mantenha seus medos consigo mesmo, mas compartilhe sua coragem com todo mundo – Robert Louis Stevenson",
            "Faça o que você puder, onde você está e com o que você tem – Theodore Roosevelt"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt( frases.length );
                textoNovaFrase.setText( frases[ numeroAleatorio ]);
            }
        });
    }
}
