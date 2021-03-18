<div class="card col-12">

			<div style="cursor: pointer;">
				<h5 class="box-title">
					<i class="fas fa-suitcase-rolling" style="font-style:20px; color: #aa6122; padding-top: 10px;"></i>
					<span style="color: #aa6122; padding-left: 10px; padding-top: 10px;">Reservations</span>
				</h5>
			</div>

		<div class="row">
		
			<div class="col-md-3">
				<div class="form-group">
					<span class="form-label ">Check In</span> <input id="checkIn" name="checkIn" class="form-control" type="date">
				</div>
			</div>
			<div class="col-md-3">
				<div class="form-group">
					<span class="form-label">Check Out</span> <input id="checkOut" name="checkOut" class="form-control" type="date">
				</div>
			</div>
			<div class="col-md-3">
				<div class="form-label" id="roomType">Room Type
                  <select class="form-control">
                    <option>Single</option>
                    <option>Double</option>
                    <option>Triple</option>
                    <option>Quadroom</option>
                    <option>King</option>
                    <option>Queen</option>
                    <option>Twin</option>
                    <option>Twin Hollywood</option>
                    <option>Double Bed</option>
                    <option>Studio</option><option>Single</option>
                    <option>Executive Suite</option>
                    <option>Presidential Suite</option>
                    <option>Villa</option>
                    <option>Cabana</option><option>Single</option>
                    <option>Adjoining Rooms</option>
                    <option>Adjacent Rooms</option>
                    <option>Executive Floor</option>
	             </select>
                </div>
              </div>
			
			<div class="col-md-1">
				<div class="form-group">
					<span class="form-label">Rooms</span> <input id="noOfRooms"
						name="noOfRooms" type="number" min="1" max="100"
						class="form-control">
				</div>
			</div>
			
			 
			<div class="col-md-1">
				<div class="form-group">
					<span class="form-label">Adults</span> <input
						id="noOfAdults" name="noOfAdults" type="number" min="1" max="50"
						class="form-control"> <span class="select-arrow"></span>
				</div>
			</div>
			<div class="col-md-1">
				<div class="form-group">
					<span class="form-label">Children</span> <input
						id="noOfChildren" name="noOfChildren" type="number" min="1"
						max="50" class="form-control">
				</div>
			</div>
		</div>
		<div class= "row">
		<div class="form-group col-4">
			<button type="button" id="previewBtn" name="previewBtn" 
			class="form-control btn aa6122" data-toggle="modal" data-target=".bd-example-modal-lg">Preview</button>
		</div>
		<div class="form-group col-4">
			<button type="button" id="proceedToPaymentBtn" name="proceedToPaymentBtn" 
			class="form-control btn aa6122" >Proceed to Payment</button>
		</div>
				
			<div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
			  <div class="modal-dialog modal-lg">
			    <div class="modal-content">
			             <jsp:include page="payment-content.jsp"></jsp:include>

			    </div>
			  </div>
			</div>
		</div>
</form>
</div>