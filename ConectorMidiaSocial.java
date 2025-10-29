public interface ConectorMidiaSocial {
    /**
     * Define o contrato unificado para postar em qualquer plataforma.
     * @param postagem O objeto de dados contendo o texto e a mídia.
     */
    void postar(Postagem postagem);
}