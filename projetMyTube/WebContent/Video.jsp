<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Video</title>
</head>
<body>
        <div class="menu-horizontal">
                <a  class="home" href="home.html">
                 <img src="img/logo.png" width="50" alt="MyTube"/>
                </a>
                <div class="search-bar">
                    <form action="">
                       <input class="champ" type="text" value="Search"/>
                       <input class="bouton" type="button" value="Search " />
                        
                   </form>
                 </div>
                 <div class="connexion">
                   
                    <a href=""><img src="img/upload_icon.png" width="30" alt="mettre en ligne"></a>
                  </div>
                  <div class="connexion"__>
                    <a href=""><img src="img/setting_icon.png" width="30" alt="parametre"></a>
                   </div>
                   
                 <div class="connexion_">
                     <a  href=""><h4>se connecter</h4> </a>
                </div>
   
           </div>
           <div class="main-video">
               <div class="main-video-left">
<!--<iframe width="854" height="480" src="https://www.youtube.com/embed/VRJVmmBEr30" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>-->
               <video width="854" height="480" controls="controls" poster="img/staffie.jpg">
                        <source src= ${ video.urlVideo }  type="video/mp4" />
             </video>
                <p>${ video.title }</p>
                    <div class="caractere-video">
                              39 087 vues
                            <a href=""><img src="img/like.png" alt="">27K</a>
                            <a href=""><img src="img/dislike.png" alt="">8,7K</a>
                            <a href=""><img src="img/share.png" alt="">PARTAGER</a>
                    </div>
                    <div class="sous-video">
                        <p><h2> BARBU A.S.D. </h2>
                            <h4>Ajoutée le 15 juin 2015 </h4>
                               Lorem ipsum dolor sit amet consectetur adipisicing elit. Provident modi assumenda ad doloremque consequatur eius nulla ratione nemo, nihil, explicabo tempora veniam perspiciatis expedita quae tempore dolor iusto nesciunt. Optio?
                        </p>
                    </div>
                    <div class="comment-bar">
                            <p><h3>35 Commentaires</h3></p>
                                <form action="">
                                        <input class="champ" type="text" value="Ajouter un commentaire public "/>
                                        <input class="bouton" type="button" value="Publier " />
                                </form>   
                     </div>
                     <div class="liste-commentaire">
                         <p><h4>içi une premier commentaire </h4></p>
                         
                     </div>
               </div>
               <div class="main-video-right">
                       <div class="block">
                             <div class="block-video"><a href="https://www.youtube.com/watch?v=uJrOUnBdmdw"><img class="image-video_mini" src="img/image-video.jpg" alt=""></a>
                             </div>
                             <div class="block-description">
                             <a class="titre-pageVideo" href="">Ceci est le  titre de la video</a>
                             <a class="auteur-pageVideo" href="">l'auteur</a>
                             <a class ="vues-pageVideo"href="">nombre de vues</a>
                             </div>
                       </div>
                       <div class="block">
                            <div class="block-video"><a href="https://www.youtube.com/watch?v=uJrOUnBdmdw"><img class="image-video_mini" src="img/image-video.jpg" alt=""></a>
                            </div>
                            <div class="block-description">
                            <a class="titre-pageVideo" href="">Ceci est le  titre de la video</a>
                            <a class="auteur-pageVideo" href="">l'auteur</a>
                            <a class ="vues-pageVideo"href="">nombre de vues</a>
                            </div>
                      </div>
                      <div class="block">
                            <div class="block-video"><a href="https://www.youtube.com/watch?v=uJrOUnBdmdw"><img class="image-video_mini" src="img/image-video.jpg" alt=""></a>
                            </div>
                            <div class="block-description">
                            <a class="titre-pageVideo" href="">Ceci est le  titre de la video</a>
                            <a class="auteur-pageVideo" href="">l'auteur</a>
                            <a class ="vues-pageVideo"href="">nombre de vues</a>
                            </div>
                      </div>
                      <div class="block">
                            <div class="block-video"><a href="https://www.youtube.com/watch?v=uJrOUnBdmdw"><img class="image-video_mini" src="img/image-video.jpg" alt=""></a>
                            </div>
                            <div class="block-description">
                            <a class="titre-pageVideo" href="">Ceci est le  titre de la video</a>
                            <a class="auteur-pageVideo" href="">l'auteur</a>
                            <a class ="vues-pageVideo"href="">nombre de vues</a>
                            </div>
                      </div>
                      <div class="block">
                            <div class="block-video"><a href="https://www.youtube.com/watch?v=uJrOUnBdmdw"><img class="image-video_mini" src="img/image-video.jpg" alt=""></a>
                            </div>
                            <div class="block-description">
                            <a class="titre-pageVideo" href="">Ceci est le  titre de la video</a>
                            <a class="auteur-pageVideo" href="">l'auteur</a>
                            <a class ="vues-pageVideo"href="">nombre de vues</a>
                            </div>
                      </div>
                      <div class="block">
                            <div class="block-video"><a href="https://www.youtube.com/watch?v=uJrOUnBdmdw"><img class="image-video_mini" src="img/image-video.jpg" alt=""></a>
                            </div>
                            <div class="block-description">
                            <a class="titre-pageVideo" href="">Ceci est le  titre de la video</a>
                            <a class="auteur-pageVideo" href="">l'auteur</a>
                            <a class ="vues-pageVideo"href="">nombre de vues</a>
                            </div>
                      </div>
                      <div class="block">
                            <div class="block-video"><a href="https://www.youtube.com/watch?v=uJrOUnBdmdw"><img class="image-video_mini" src="img/image-video.jpg" alt=""></a>
                            </div>
                            <div class="block-description">
                            <a class="titre-pageVideo" href="">Ceci est le  titre de la video</a>
                            <a class="auteur-pageVideo" href="">l'auteur</a>
                            <a class ="vues-pageVideo"href="">nombre de vues</a>
                            </div>
                      </div>
                      <div class="block">
                            <div class="block-video"><a href="https://www.youtube.com/watch?v=uJrOUnBdmdw"><img class="image-video_mini" src="img/image-video.jpg" alt=""></a>
                            </div>
                            <div class="block-description">
                            <a class="titre-pageVideo" href="">Ceci est le  titre de la video</a>
                            <a class="auteur-pageVideo" href="">l'auteur</a>
                            <a class ="vues-pageVideo"href="">nombre de vues</a>
                            </div>
                      </div>
                      <div class="block">
                            <div class="block-video"><a href="https://www.youtube.com/watch?v=uJrOUnBdmdw"><img class="image-video_mini" src="img/image-video.jpg" alt=""></a>
                            </div>
                            <div class="block-description">
                            <a class="titre-pageVideo" href="">Ceci est le  titre de la video</a>
                            <a class="auteur-pageVideo" href="">l'auteur</a>
                            <a class ="vues-pageVideo"href="">nombre de vues</a>
                            </div>
                      </div>
                      <div class="block">
                            <div class="block-video"><a href="https://www.youtube.com/watch?v=uJrOUnBdmdw"><img class="image-video_mini" src="img/image-video.jpg" alt=""></a>
                            </div>
                            <div class="block-description">
                            <a class="titre-pageVideo" href="">Ceci est le  titre de la video</a>
                            <a class="auteur-pageVideo" href="">l'auteur</a>
                            <a class ="vues-pageVideo"href="">nombre de vues</a>
                            </div>
                      </div>

               </div>

           </div>
    
</body>
</html>