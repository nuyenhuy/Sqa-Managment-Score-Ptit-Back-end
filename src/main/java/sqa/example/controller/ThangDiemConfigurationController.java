package sqa.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sqa.example.model.*;

import java.util.*;
import sqa.example.service.ThangDiemService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/cau-hinh/")
public class ThangDiemConfigurationController {
    private final ThangDiemService thangDiemService;

    @GetMapping("/thang-diems")
    public ResponseEntity<List<ThangDiem>> all() 
	{
        return ResponseEntity.ok(thangDiemService.getAll());
    }
	
	@GetMapping("/thang-diems/{id}")
    public ResponseEntity<ThangDiem> one(@PathVariable("id") Integer id) 
	{
        return ResponseEntity.ok(thangDiemService.get(id));
    }

	@PostMapping("/thang-diems")
	public ResponseEntity<ThangDiem> create(@RequestBody ThangDiem thangDiem) 
	{
		return ResponseEntity.ok(thangDiemService.create(thangDiem));
	}
	
	@PutMapping("/thang-diems")
    public ResponseEntity<ThangDiem> update(@RequestBody ThangDiem thangDiem) 
	{
		return ResponseEntity.ok(thangDiemService.update(thangDiem));
    }
	
	@DeleteMapping("/thang-diems/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id) 
	{
		return ResponseEntity.ok(thangDiemService.delete(id));
	}
}