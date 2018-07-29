import { CanDeactivate } from "../../../node_modules/@angular/router";
import { CreateEventComponent } from "../components";
import { Injectable } from "../../../node_modules/@angular/core";
@Injectable({
    providedIn: 'root'
})
export class CreateRouteDeactivate implements CanDeactivate<CreateEventComponent> {

    canDeactivate(createComponent: CreateEventComponent) {
        if (createComponent.isFormDirty) {
            return window.confirm("Are you sure you want to navigate?");
        }
        return true;
    }
}
