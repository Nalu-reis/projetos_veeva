document.addEventListener("DOMContentLoaded", function () {
  const wrapper = document.querySelector(".rigth");
  const slides = document.querySelectorAll(".visivel");
  const prevButton = document.getElementById("prevButton");
  const nextButton = document.getElementById("nextButton");
  let currentIndex = 0;

  const like = document.getElementById("like");
  const deslike = document.getElementById("deslike");
  const txt_like = document.getElementById("txt-like");
  const txt_deslike = document.getElementById("txt-deslike");
  let like_cont = 0;
  let deslike_cont = 0;
  like.addEventListener("click", () => {
    like_cont++;
    txt_like.textContent = like_cont;
  });
  deslike.addEventListener("click", () => {
    deslike_cont++;
    txt_deslike.textContent = deslike_cont;
  });

  function showSlide(index) {
    currentIndex = index;
    slides.forEach((slide, i) => {
      slide.style.display = i === index ? "block" : "none";
    });
    if (currentIndex > 0) {
      prevButton.style.display = "block";
    } else {
      prevButton.style.display = "none";
    }
  }

  function nextSlide() {
    currentIndex = (currentIndex + 1) % slides.length;
    showSlide(currentIndex);
  }

  function prevSlide() {
    currentIndex = (currentIndex - 1 + slides.length) % slides.length;
    showSlide(currentIndex);
  }

  // Adicione listeners aos botões
  nextButton.addEventListener("click", nextSlide);
  prevButton.addEventListener("click", prevSlide);

  // Exiba o primeiro slide
  showSlide(currentIndex);
});
