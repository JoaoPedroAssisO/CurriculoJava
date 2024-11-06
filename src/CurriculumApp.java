import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurriculumApp {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Currículo de João Pedro");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(0x005F73));
        headerPanel.setLayout(new GridLayout(2, 1));
        JLabel headerTitle = new JLabel("Olá, eu sou João Pedro", JLabel.CENTER);
        headerTitle.setFont(new Font("Arial", Font.BOLD, 24));
        headerTitle.setForeground(Color.WHITE);
        JLabel headerSubtitle = new JLabel("Programador Full-Stack | Desenvolvedor Web", JLabel.CENTER);
        headerSubtitle.setFont(new Font("Arial", Font.PLAIN, 16));
        headerSubtitle.setForeground(Color.WHITE);
        headerPanel.add(headerTitle);
        headerPanel.add(headerSubtitle);

       
        JPanel sobrePanel = new JPanel();
        sobrePanel.setBackground(Color.WHITE);
        sobrePanel.setLayout(new BorderLayout());
        JLabel sobreTitle = new JLabel("Sobre Mim");
        sobreTitle.setFont(new Font("Arial", Font.BOLD, 20));
        sobreTitle.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JTextArea sobreText = new JTextArea(
                "Sou um desenvolvedor apaixonado por tecnologia, com experiência em HTML, CSS, JavaScript e outras linguagens de programação. Atualmente, estou focado na linguagem Java, pois, ao me aprofundar nos estudos dessa linguagem, percebi o quão incrível ela é e o vasto leque de oportunidades que proporciona. Apesar de sua curva de aprendizado ser mais acentuada devido à sua complexidade, me apaixonei pela versatilidade dessa linguagem e busco, a cada dia, me aprofundar nela. No entanto, possuo conhecimento em outras linguagens e tecnologias e estou sempre em busca de novos desafios para aprimorar minhas habilidades.");
        sobreText.setLineWrap(true);
        sobreText.setWrapStyleWord(true);
        sobreText.setEditable(false);
        sobreText.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        sobrePanel.add(sobreTitle, BorderLayout.NORTH);
        sobrePanel.add(sobreText, BorderLayout.CENTER);

        
        JPanel skillsPanel = new JPanel();
        skillsPanel.setLayout(new BorderLayout());
        JLabel skillsTitle = new JLabel("Habilidades");
        skillsTitle.setFont(new Font("Arial", Font.BOLD, 20));
        skillsTitle.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        String[] skills = {"Java", "HTML5", "CSS3", "JavaScript", "React", "Node.js", "Git, GitHub e GitLab", "MYSQL", "Redes", "Python"};
        JList<String> skillsList = new JList<>(skills);
        skillsList.setBackground(new Color(0xE9D8A6));
        skillsList.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        skillsPanel.add(skillsTitle, BorderLayout.NORTH);
        skillsPanel.add(new JScrollPane(skillsList), BorderLayout.CENTER);

        
        JPanel experienciaPanel = new JPanel();
        experienciaPanel.setLayout(new BorderLayout());
        JLabel experienciaTitle = new JLabel("Experiência");
        experienciaTitle.setFont(new Font("Arial", Font.BOLD, 20));
        experienciaTitle.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JTextArea experienciaText = new JTextArea(
                "Analista de Infraestrutura na empresa Expresso Valônia - Atualmente\n"
                        + "Auxiliar Administrativo no TI da empresa Balteau Grupo WEG - 2023 - 2024");
        experienciaText.setLineWrap(true);
        experienciaText.setWrapStyleWord(true);
        experienciaText.setEditable(false);
        experienciaText.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        experienciaPanel.add(experienciaTitle, BorderLayout.NORTH);
        experienciaPanel.add(experienciaText, BorderLayout.CENTER);

        
        JPanel contatoPanel = new JPanel();
        contatoPanel.setLayout(new GridLayout(6, 1, 5, 5));
        contatoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel contatoTitle = new JLabel("Contato");
        contatoTitle.setFont(new Font("Arial", Font.BOLD, 20));
        contatoPanel.add(contatoTitle);
        String[] contatos = {
                "Telefone/whatsApp: +55(35)998818657",
                "Email: joaopedroassis.dev@gmail.com",
                "GitHub: github.com/JoaoPedroAssisO",
                "GitLab: gitlab.com/JoaoPedroAss",
                "Instagram: instagram.com/_jjoao.pedro"
        };
        for (String contato : contatos) {
            JLabel contatoLabel = new JLabel(contato);
            contatoLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            contatoPanel.add(contatoLabel);
        }

       
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(0x005F73));
        JLabel footerText = new JLabel("© 2024 João Pedro Assis", JLabel.CENTER);
        footerText.setForeground(Color.WHITE);
        footerPanel.add(footerText);

        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(headerPanel);
        mainPanel.add(sobrePanel);
        mainPanel.add(skillsPanel);
        mainPanel.add(experienciaPanel);
        mainPanel.add(contatoPanel);

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(footerPanel, BorderLayout.SOUTH);

        
        frame.setVisible(true);
    }
}

