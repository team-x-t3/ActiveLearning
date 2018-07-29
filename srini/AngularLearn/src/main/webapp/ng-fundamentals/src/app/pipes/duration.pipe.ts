import { PipeTransform, Pipe } from "../../../node_modules/@angular/core";
@Pipe({
    name: 'duration'
})
export class DurationPipe implements PipeTransform {
    transform(value: number) {
        switch (value) {
            case 1: return 'HALF_HOUR';
            case 2: return 'ONE_HOUR';
            case 3: return 'HALF_DAY';
            case 4: return 'FULL_DAY';
            default: return value;
        }
    }
}
