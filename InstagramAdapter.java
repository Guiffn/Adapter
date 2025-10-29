public class InstagramAdapter implements ConectorMidiaSocial {
    private InstagramAPI instagramApi; 

    public InstagramAdapter(InstagramAPI instagramApi) {
        this.instagramApi = instagramApi;
    }

    @Override
    public void postar(Postagem postagem) {
        instagramApi.publicarFoto(postagem.getUrlMidia(), postagem.getTexto());
        System.out.println("Publicação enviada ao Instagram.");
    }
}