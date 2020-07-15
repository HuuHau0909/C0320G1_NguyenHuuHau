import { Component, OnInit,Input,OnDestroy } from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.scss']
})
export class CountdownTimerComponent implements OnInit,OnDestroy {
private intervalId = 0;
message ='';
remainingTime:number;
  @Input()
seconds=15;
clearTimer(){}
start(){}
stop(){}
reset(){}
private countdown(){}

  constructor() { }

  ngOnInit() {
  }

  ngOnDestroy(): void {
  }

}
