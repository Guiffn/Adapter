public class TiktokAdapter implements ConectorMidiaSocial {
    private TikTokAPI tikTokApi; 

    public TiktokAdapter(TikTokAPI tikTokApi) {
        this.tikTokApi = tikTokApi;
    }

    @Override
    public void postar(Postagem postagem) {
        tikTokApi.postarVideo(postagem.getUrlMidia());
        System.out.println("Publicação enviada ao TikTok.");
    }
}