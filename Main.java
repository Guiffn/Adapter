public class Main {
    public static void main(String[] args) {
        
        TwitterAPI apiTwitter = new TwitterAPI();
        InstagramAPI apiInstagram = new InstagramAPI();
        LinkedInAPI apiLinkedIn = new LinkedInAPI();
        TikTokAPI apiTikTok = new TikTokAPI();

        
        ConectorMidiaSocial conexaoTwitter = new TwitterAdapter(apiTwitter);
        ConectorMidiaSocial conexaoInstagram = new InstagramAdapter(apiInstagram);
        ConectorMidiaSocial conexaoLinkedIn = new LinkedInAdapter(apiLinkedIn);
        ConectorMidiaSocial conexaoTikTok = new TiktokAdapter(apiTikTok);

       
        Postagem postSimples = new Postagem("Olá mundo! Este é meu post unificado.", null);
        Postagem postComFoto = new Postagem("Que paisagem incrível!", "http://imagem.com/paisagem.jpg");
        Postagem postComVideo = new Postagem("Meu novo vídeo de dança!", "http://video.com/dancinha.mp4");

        
        System.out.println("### INICIANDO PUBLICAÇÕES ###\n");

        conexaoTwitter.postar(postSimples);
        conexaoInstagram.postar(postComFoto);
        conexaoLinkedIn.postar(postSimples);
        conexaoTikTok.postar(postComVideo);

        System.out.println("\n### PUBLICAÇÕES FINALIZADAS ###");
    }
}