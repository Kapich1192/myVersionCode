//slider-swiper
var swiper = new Swiper(".swiper-container", {
    loopedSlides: 2,
    loop: false,
    speed: 400,
    spaceBetween: 50,
    slidesPerView: "auto",
    freeMode: true,
    maxBackfaceHiddenSlides: 2,
    mousewheel: {
        releaseOnEdges: true,
    },
    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
    },
});

var thumb = document.querySelectorAll(".thumbContainer");

thumb.forEach(function(image, index) {
    var delay = index * 90;
    image.classList.add("fadeInSlide");
    image.style.animationDelay = delay + "ms";
});
