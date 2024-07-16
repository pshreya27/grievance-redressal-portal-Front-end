import { Component } from '@angular/core';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-carousel',
  standalone: true,
  imports :[NgIf],
  templateUrl: './carousel.component.html',
  styleUrls: ['./carousel.component.css'],
})
export class CarouselComponent {
  slides: string[];
  i: number;

  constructor() {
    this.i = 0;
    this.slides = [
      'https://ep01.epimg.net/elcomidista/imagenes/2022/10/31/articulo/1667206537_604382_1667230832_noticia_normal.jpg',
      'https://storage.googleapis.com/css-photos/menu-photos/1d2d5a63-1603-473b-9464-e8fa6787f40b.jpeg',
      'https://ep01.epimg.net/elcomidista/imagenes/2022/01/11/receta/1641893642_902475_1641893828_noticia_normal.jpg',
    ];
  }
  
  getSlide() {
    return this.slides[this.i];
  }

  getPrev() {
    this.i == 0 ? (this.i = this.slides.length - 1) : this.i--;
  }

  getNext() {
    this.i < this.slides.length - 1 ? this.i++ : (this.i = 0);
    
  }
}
